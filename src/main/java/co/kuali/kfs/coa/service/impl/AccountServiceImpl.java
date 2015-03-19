package co.kuali.kfs.coa.service.impl;

import org.apache.log4j.Logger;
import org.kuali.kfs.sys.KFSParameterKeyConstants;
import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.kfs.sys.service.impl.KfsParameterConstants;
import org.kuali.rice.coreservice.framework.parameter.ParameterService;

/**
 * Created by bh79 on 3/19/15.
 */
public class AccountServiceImpl extends org.kuali.kfs.coa.service.impl.AccountServiceImpl {
    private static final Logger LOG = Logger.getLogger(AccountServiceImpl.class);

    @Override
    public Boolean isFridgeBenefitCalculationEnable(){
        LOG.info("entering isFridgeBenefitCalculationEnable()");
        Boolean enabled = super.isFridgeBenefitCalculationEnable();
        LOG.info("isFridgeBenefitCalculationEnable: " + enabled);

        return enabled;
    }

}
