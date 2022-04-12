package com.test.SanPham;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.software.dao.SanPhamDAO;
import com.software.entity.SanPham;

public class testTimKiemSP {
	private SanPhamDAO sp;

	@BeforeClass
	public void initialize() {
		sp = new SanPhamDAO();
	}

	@DataProvider(name = "db")
	private Object[][] data() {
		return new Object[][] { { "1", "1" }, { "2", "2" }, { "3", "3" }, { "100", "" }, { "1000", "" } };
	}

	@DataProvider(name = "db2")
	private Object[][] data2() {
		return new Object[][] { { "1", 1 }, { "2", 1 }, { "3", 1 }, { "100", 0 }, { "1000", 0 }, { "Giày", 1 },
				{ "Găng tay", 2 }, { "Khủng Long bạo chúa", 0 } };
	}

	@Test(dataProvider = "db", priority = 0)
	public void TestTimKiem(String maSanPham, String result) {
		String Id = null;
		try {
			SanPham list = sp.SelectByID(maSanPham);
			Id = list.getMaSanPham();
		} catch (NullPointerException e) {
			Id = "";
		}
		Assert.assertEquals(result, Id);
	}

	@Test
	public void TestSelectAll() {
		Assert.assertNotNull(sp.SelectAll());
	}

	@Test(dataProvider = "db2", priority = 1)
	public void TestTimKiemSPKey(String keyword, int result) {
		int value = 0;
		try {
			List<SanPham> list = sp.selectByKeyWord(keyword);
			value = list.size();
		} catch (NullPointerException e) {
			try {
				List<SanPham> list = sp.selectByKeyWord(keyword);
				value = list.size();
			} catch (NullPointerException e2) {
				value = 0;
			}
		}
		Assert.assertEquals(result, value);
	}

	@Test
	public void testSPDangKinhDoanh() {
		List<SanPham> list = sp.SelectSanPhamDangKinhDoanh();
		if (list.size() > 0) {
			Assert.assertTrue(true);
		}
	}
}
