/*******************************************************************************
 * Copyright 2015 Alexander Casall, Manuel Mauky
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.saxsys.mvvmfx.scopes.example1.views;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;
import javafx.fxml.FXML;

/**
 * This class is used as example View class that uses FXML.
 * 
 * @author alexander.casall
 */
public class ScopedFxmlViewA implements FxmlView<ScopedViewModelA> {

    @InjectViewModel
    public ScopedViewModelA viewModel;

    @FXML
    public ScopedFxmlViewC subviewCController;

    @FXML
    public ScopedFxmlViewE subviewEController;


    public ScopedFxmlViewA() {
        System.out.println("new " + this.getClass().getSimpleName() + "()");
    }

    public void initialize() {
        System.out.println(this.getClass().getSimpleName() + ".initialize()");
    }
}
