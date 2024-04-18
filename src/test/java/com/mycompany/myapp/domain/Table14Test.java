package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table14TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table14Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table14.class);
        Table14 table141 = getTable14Sample1();
        Table14 table142 = new Table14();
        assertThat(table141).isNotEqualTo(table142);

        table142.setId(table141.getId());
        assertThat(table141).isEqualTo(table142);

        table142 = getTable14Sample2();
        assertThat(table141).isNotEqualTo(table142);
    }
}
