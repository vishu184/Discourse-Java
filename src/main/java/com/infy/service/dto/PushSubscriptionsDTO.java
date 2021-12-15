/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link com.infy.domain.PushSubscriptions} entity.
 */
public class PushSubscriptionsDTO extends AbstractAuditingDTO implements Serializable {

    private Long id;

    @NotNull
    private String userId;

    @NotNull
    private String data;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PushSubscriptionsDTO)) {
            return false;
        }

        return id != null && id.equals(((PushSubscriptionsDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PushSubscriptionsDTO{" +
            "id=" + getId() +
            ", userId='" + getUserId() + "'" +
            ", data='" + getData() + "'" +
            "}";
    }
}
