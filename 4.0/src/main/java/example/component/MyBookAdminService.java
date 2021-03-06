/*
 * Copyright 2013 the original author or authors.
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
package example.component;

import org.springframework.beans.factory.annotation.Autowired;

import example.composable.MyApplicationService;

/**
 * @author Oliver Gierke
 */
@MyApplicationService(readOnly = false)
class MyBookAdminService implements BookAdminService {

	private final BookRepository repository;

	/**
	 * @param repository
	 */
	@Autowired
	public MyBookAdminService(BookRepository repository) {
		this.repository = repository;
	}

	public BookUpdate updateBook(Addendum addendum) {
		return new BookUpdate();
	}
}
