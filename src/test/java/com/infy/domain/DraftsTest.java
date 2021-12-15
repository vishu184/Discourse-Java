/*
 * Copyright 2021 Infosys Ltd.
 * Use of this source code is governed by GNU General Public License version 2
 * that can be found in the LICENSE file or at
 * https://opensource.org/licenses/GPL-2.0
 */

package com.infy.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.infy.web.rest.TestUtil;

public class DraftsTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Drafts.class);
        Drafts drafts1 = new Drafts();
        drafts1.setId(1L);
        Drafts drafts2 = new Drafts();
        drafts2.setId(drafts1.getId());
        assertThat(drafts1).isEqualTo(drafts2);
        drafts2.setId(2L);
        assertThat(drafts1).isNotEqualTo(drafts2);
        drafts1.setId(null);
        assertThat(drafts1).isNotEqualTo(drafts2);
    }
}
