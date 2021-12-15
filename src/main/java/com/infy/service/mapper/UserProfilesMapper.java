/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.mapper;


import com.infy.domain.*;
import com.infy.service.dto.UserProfilesDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link UserProfiles} and its DTO {@link UserProfilesDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface UserProfilesMapper extends EntityMapper<UserProfilesDTO, UserProfiles> {


    @Mapping(target = "badges", ignore = true)
    @Mapping(target = "removeBadges", ignore = true)
    @Mapping(target = "uploads", ignore = true)
    @Mapping(target = "removeUploads", ignore = true)
    UserProfiles toEntity(UserProfilesDTO userProfilesDTO);

    default UserProfiles fromId(Long id) {
        if (id == null) {
            return null;
        }
        UserProfiles userProfiles = new UserProfiles();
        userProfiles.setId(id);
        return userProfiles;
    }
}
