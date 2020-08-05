/*
 * Copyright © 2020 pleuvoir (pleuvior@foxmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.pleuvoir.gateway.service.internal.impl;

import io.github.pleuvoir.gateway.dao.pay.PayProductDao;
import io.github.pleuvoir.gateway.model.po.PayProductPO;
import io.github.pleuvoir.gateway.service.internal.PayProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:fuwei@daojia-inc.com">pleuvoir</a>
 */
@Service
public class PayProductServiceImpl implements PayProductService {

    @Autowired
    private PayProductDao productDao;

    @Override
    public PayProductPO getByCode(String code) {
        PayProductPO query = new PayProductPO();
        query.setPayProductCode(code);
        PayProductPO payProductPO = productDao.selectOne(query);
        return payProductPO;
    }
}
