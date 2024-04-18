package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table16TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table16Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table16.class);
        Table16 table161 = getTable16Sample1();
        Table16 table162 = new Table16();
        assertThat(table161).isNotEqualTo(table162);

        table162.setId(table161.getId());
        assertThat(table161).isEqualTo(table162);

        table162 = getTable16Sample2();
        assertThat(table161).isNotEqualTo(table162);
    }
}
