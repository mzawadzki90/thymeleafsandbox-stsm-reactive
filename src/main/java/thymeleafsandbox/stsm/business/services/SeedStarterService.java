/*
 * =============================================================================
 *
 *   Copyright (c) 2011-2016, The THYMELEAF team (http://www.thymeleaf.org)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * =============================================================================
 */
package thymeleafsandbox.stsm.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import thymeleafsandbox.stsm.business.entities.SeedStarter;
import thymeleafsandbox.stsm.business.entities.repositories.SeedStarterRepository;

@Service
public class SeedStarterService {

    @Autowired
    private SeedStarterRepository seedstarterRepository;

    public SeedStarterService() {
        super();
    }

    public Flux<SeedStarter> findAll() {
        return this.seedstarterRepository.findAll();
    }

    public Mono<Void> add(final SeedStarter seedStarter) {
        return this.seedstarterRepository.add(seedStarter);
    }

}
