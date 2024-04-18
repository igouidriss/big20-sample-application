package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table11TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table11Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table11.class);
        Table11 table111 = getTable11Sample1();
        Table11 table112 = new Table11();
        assertThat(table111).isNotEqualTo(table112);

        table112.setId(table111.getId());
        assertThat(table111).isEqualTo(table112);

        table112 = getTable11Sample2();
        assertThat(table111).isNotEqualTo(table112);
    }
}
