/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.mapper;


import com.infy.domain.*;
import com.infy.service.dto.GroupHistoriesDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link GroupHistories} and its DTO {@link GroupHistoriesDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface GroupHistoriesMapper extends EntityMapper<GroupHistoriesDTO, GroupHistories> {



    default GroupHistories fromId(Long id) {
        if (id == null) {
            return null;
        }
        GroupHistories groupHistories = new GroupHistories();
        groupHistories.setId(id);
        return groupHistories;
    }
}
