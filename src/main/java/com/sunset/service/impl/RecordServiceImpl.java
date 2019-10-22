package com.sunset.service.impl;
import com.sunset.dao.TProductMapper;
import com.sunset.dao.TRecordMapper;
import com.sunset.model.TProduct;
import com.sunset.model.TRecord;
import com.sunset.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author sunset
 * @date 2019-10-19 02:50
 */
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private TRecordMapper recordMapper;
    @Autowired
    private TProductMapper productMapper;
    @Override
    public List<TRecord> findByIdRecord(Integer pid) {
        Example example = new Example(TRecord.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("pid",pid);
        List<TRecord> tRecords = recordMapper.selectByExample(example);
        return tRecords;
    }

    @Override
    public void insertRecord(String id,double price, TProduct product) {
        System.out.println(product);
        TRecord tRecord = new TRecord();
        tRecord.setUid(id);
        tRecord.setPid(product.getId());
        tRecord.setAddprice(price);
        tRecord.setBeforeprice(product.getPrice());
        tRecord.setNowprice((new BigDecimal(Double.toString(price)).add(new BigDecimal(Double.toString(product.getPrice())))).doubleValue());
        tRecord.setCreattime(new Date());
        tRecord.setStarttime(product.getStarttime());
        tRecord.setEndtime(product.getEndtime());
        tRecord.setProductname(product.getProductname());
        recordMapper.insert(tRecord);
        //更改商品的价格
        product.setPrice(tRecord.getNowprice());
        productMapper.updateByPrimaryKeySelective(product);


    }
}
