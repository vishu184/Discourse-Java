/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.mapper;


import com.infy.domain.*;
import com.infy.service.dto.BookmarksDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Bookmarks} and its DTO {@link BookmarksDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BookmarksMapper extends EntityMapper<BookmarksDTO, Bookmarks> {



    default Bookmarks fromId(Long id) {
        if (id == null) {
            return null;
        }
        Bookmarks bookmarks = new Bookmarks();
        bookmarks.setId(id);
        return bookmarks;
    }
}
