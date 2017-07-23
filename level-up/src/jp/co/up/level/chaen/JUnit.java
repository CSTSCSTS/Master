package jp.co.up.level.chaen;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit {

	@Test
  public void testNum() {
     assertThat(TargetJUnit.num(),is(not(10)));
  }


}
