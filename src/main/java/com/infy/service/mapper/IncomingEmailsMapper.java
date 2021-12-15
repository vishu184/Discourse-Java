/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.mapper;


import com.infy.domain.*;
import com.infy.service.dto.IncomingEmailsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link IncomingEmails} and its DTO {@link IncomingEmailsDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface IncomingEmailsMapper extends EntityMapper<IncomingEmailsDTO, IncomingEmails> {



    default IncomingEmails fromId(Long id) {
        if (id == null) {
            return null;
        }
        IncomingEmails incomingEmails = new IncomingEmails();
        incomingEmails.setId(id);
        return incomingEmails;
    }
}
