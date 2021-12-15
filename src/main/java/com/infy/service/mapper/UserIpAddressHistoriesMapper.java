/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.mapper;


import com.infy.domain.*;
import com.infy.service.dto.UserIpAddressHistoriesDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link UserIpAddressHistories} and its DTO {@link UserIpAddressHistoriesDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface UserIpAddressHistoriesMapper extends EntityMapper<UserIpAddressHistoriesDTO, UserIpAddressHistories> {



    default UserIpAddressHistories fromId(Long id) {
        if (id == null) {
            return null;
        }
        UserIpAddressHistories userIpAddressHistories = new UserIpAddressHistories();
        userIpAddressHistories.setId(id);
        return userIpAddressHistories;
    }
}
