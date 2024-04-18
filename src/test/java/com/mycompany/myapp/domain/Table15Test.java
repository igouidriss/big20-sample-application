package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.Table15TestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class Table15Test {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Table15.class);
        Table15 table151 = getTable15Sample1();
        Table15 table152 = new Table15();
        assertThat(table151).isNotEqualTo(table152);

        table152.setId(table151.getId());
        assertThat(table151).isEqualTo(table152);

        table152 = getTable15Sample2();
        assertThat(table151).isNotEqualTo(table152);
    }
}
