/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.infy.web.rest.TestUtil;

public class GivenDailyLikesDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(GivenDailyLikesDTO.class);
        GivenDailyLikesDTO givenDailyLikesDTO1 = new GivenDailyLikesDTO();
        givenDailyLikesDTO1.setId(1L);
        GivenDailyLikesDTO givenDailyLikesDTO2 = new GivenDailyLikesDTO();
        assertThat(givenDailyLikesDTO1).isNotEqualTo(givenDailyLikesDTO2);
        givenDailyLikesDTO2.setId(givenDailyLikesDTO1.getId());
        assertThat(givenDailyLikesDTO1).isEqualTo(givenDailyLikesDTO2);
        givenDailyLikesDTO2.setId(2L);
        assertThat(givenDailyLikesDTO1).isNotEqualTo(givenDailyLikesDTO2);
        givenDailyLikesDTO1.setId(null);
        assertThat(givenDailyLikesDTO1).isNotEqualTo(givenDailyLikesDTO2);
    }
}
