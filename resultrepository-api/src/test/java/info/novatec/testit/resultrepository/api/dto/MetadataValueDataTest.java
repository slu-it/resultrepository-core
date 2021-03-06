package info.novatec.testit.resultrepository.api.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import utils.TestUtils;


public class MetadataValueDataTest {

    @Test
    public void testCopyConstructor() {

        MetadataValueData original = TestUtils.defaultMetadataValue();
        MetadataValueData copy = new MetadataValueData(original);

        assertThat(copy).isEqualTo(original);
        assertThat(copy).isEqualToComparingFieldByField(original);

    }

}
