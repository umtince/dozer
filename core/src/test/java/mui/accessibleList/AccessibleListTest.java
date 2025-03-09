/*
 * Copyright 2005-2024 Dozer Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mui.accessibleList;

import com.github.dozermapper.core.AbstractDozerTest;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import mui.accessibleList.model.Dst;
import mui.accessibleList.model.Src;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;

public class AccessibleListTest extends AbstractDozerTest {

    @Test
    public void test() {
        Mapper mapper = DozerBeanMapperBuilder.create()
                .withMappingFiles("mappings/accessibleListMapping.xml")
                .build();

        Src src = new Src();
        src.setSrcList(List.of(1,2,3,4,5,6,7,8,9));
        Dst dst = mapper.map(src, Dst.class);

        assertEquals(List.of("1","2","3","4","5","6","7","8","9"), dst.getDstList());
    }
}
