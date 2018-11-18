package aws.cfn.codegen;


import aws.cfn.codegen.json.Main;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MainTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void codegen() throws Exception {
        Main.main(
            new String[] {
                "--aws-region",
                "us-east-2",
                "--output-dir",
                "/tmp/cfn-v2/json/",
                "--json-schema-version",
                "draft04"
            }
        );
    }

    @Test
    public void codegenConfigSpec() throws Exception {
        Main.main(
            new String[] {
                "--cfn-spec-url",
                "https://dnwj8swjjbsbt.cloudfront.net/latest/gzip/CloudFormationResourceSpecification.json",
                "--aws-region",
                "us-east-2",
                "--output-dir",
                "/tmp/cfn-v2/cfg-json/",
                "--json-schema-version",
                "draft04",
                "--config-file",
                "src/main/resources/config.yml"
            }
        );
    }

    @Test
    public void codegenDefault() throws Exception {
        Main.main(new String[0]);
    }


}