package jp.mixi.triaina.commons.test.utils;

import java.io.ByteArrayOutputStream;

import jp.mixi.triaina.commons.utils.CloseableUtils;
import junit.framework.TestCase;

public class CloseableUtilsTest extends TestCase {

	public void testClose() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		CloseableUtils.close(out);
		CloseableUtils.close(null);
	}
}
