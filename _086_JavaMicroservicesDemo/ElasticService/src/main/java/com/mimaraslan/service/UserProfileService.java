package com.mimaraslan.service;

import com.mimaraslan.dto.request.PagingRequestDto;
import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.mapper.IUserProfileMapper;
import com.mimaraslan.repository.IUserProfileRepository;
import com.mimaraslan.repository.entity.UserProfile;
import com.mimaraslan.utility.ServiceManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager <UserProfile, Long> {

    private final IUserProfileRepository iUserProfileRepository;

    public UserProfileService(IUserProfileRepository iUserProfileRepository) {
        super(iUserProfileRepository);
        this.iUserProfileRepository = iUserProfileRepository;
    }

    public void saveDto(UserProfileSaveRequestDto dto) {

        /**
         * Eğer userprofileid daha önceden kayıtlıysa, kaydetmesini engelle.
         */
      //  if(!iUserProfileRepository.existsUserProfileById(dto.getId()))
            save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
    }


    public Page<UserProfile> findAll(PagingRequestDto dto){

        Pageable pageable = null;
        Sort sort = null;

        // FIXME "ASC" "DESC" if kontrolu yapılacak.
        if (dto.getSortParameter()!=null){
            // Ternary //  ŞART   ? SAĞLANIRSA : SAĞLANMAZSA ;
            String direction =  dto.getDirection()=="ASC" ? "ASC"  : dto.getDirection();
            sort = Sort.by(Sort.Direction.fromString(direction), dto.getSortParameter());

        }

        // FIXME  if kontrolu yapılacak.
        Integer pageSize = dto.getPageSize() == null ? 10 :    dto.getPageSize() < 1  ? 10:  dto.getPageSize()     ;

        // hem sırlama hem de sayfalama seçildi.
        if(sort !=null  &&  dto.getCurrentPage()!=null){

            pageable = PageRequest.of(dto.getCurrentPage(), pageSize, sort);

        } else  if(sort ==null  &&  dto.getCurrentPage() !=null){
            pageable = PageRequest.of(dto.getCurrentPage(), pageSize);

        } else {
            pageable = PageRequest.of(0, pageSize);
        }

        return iUserProfileRepository.findAll(pageable);
    }


}
