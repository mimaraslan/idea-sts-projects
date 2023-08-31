package com.mimaraslan.mapper;

import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.rabbitmq.model.SaveAuthModel;
import com.mimaraslan.repository.entity.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserProfileMapper {

    IUserProfileMapper INSTANCE= Mappers.getMapper(IUserProfileMapper.class);

    UserProfile toUserProfile(final UserProfileSaveRequestDto dto);
    UserProfile toUserProfile(final SaveAuthModel model);

}
