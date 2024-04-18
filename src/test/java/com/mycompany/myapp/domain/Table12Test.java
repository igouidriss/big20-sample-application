package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table12TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table12Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table12.class);
        Table12 table121 = getTable12Sample1();
        Table12 table122 = new Table12();
        assertThat(table121).isNotEqualTo(table122);

        table122.setId(table121.getId());
        assertThat(table121).isEqualTo(table122);

        table122 = getTable12Sample2();
        assertThat(table121).isNotEqualTo(table122);
    }
}
