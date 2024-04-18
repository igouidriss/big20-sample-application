package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table20TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table20Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table20.class);
        Table20 table201 = getTable20Sample1();
        Table20 table202 = new Table20();
        assertThat(table201).isNotEqualTo(table202);

        table202.setId(table201.getId());
        assertThat(table201).isEqualTo(table202);

        table202 = getTable20Sample2();
        assertThat(table201).isNotEqualTo(table202);
    }
}
