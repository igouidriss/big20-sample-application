package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table17TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table17Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table17.class);
        Table17 table171 = getTable17Sample1();
        Table17 table172 = new Table17();
        assertThat(table171).isNotEqualTo(table172);

        table172.setId(table171.getId());
        assertThat(table171).isEqualTo(table172);

        table172 = getTable17Sample2();
        assertThat(table171).isNotEqualTo(table172);
    }
}
