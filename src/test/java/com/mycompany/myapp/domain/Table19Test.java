package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table19TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table19Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table19.class);
        Table19 table191 = getTable19Sample1();
        Table19 table192 = new Table19();
        assertThat(table191).isNotEqualTo(table192);

        table192.setId(table191.getId());
        assertThat(table191).isEqualTo(table192);

        table192 = getTable19Sample2();
        assertThat(table191).isNotEqualTo(table192);
    }
}
