package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table18TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table18Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table18.class);
        Table18 table181 = getTable18Sample1();
        Table18 table182 = new Table18();
        assertThat(table181).isNotEqualTo(table182);

        table182.setId(table181.getId());
        assertThat(table181).isEqualTo(table182);

        table182 = getTable18Sample2();
        assertThat(table181).isNotEqualTo(table182);
    }
}
