package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table13TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table13Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table13.class);
        Table13 table131 = getTable13Sample1();
        Table13 table132 = new Table13();
        assertThat(table131).isNotEqualTo(table132);

        table132.setId(table131.getId());
        assertThat(table131).isEqualTo(table132);

        table132 = getTable13Sample2();
        assertThat(table131).isNotEqualTo(table132);
    }
}
