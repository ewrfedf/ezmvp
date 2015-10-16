/*
 * Copyright 2014 Chris Banes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package zcp.mvp.controllers;


import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AboutController extends BaseUiController<AboutController.AboutUi,
        AboutController.AboutUiCallbacks> {


    public  AboutController mAboutController;
    @Inject
    public AboutController(){

    }

    public interface AboutUi extends BaseUiController.Ui<AboutUiCallbacks> {}


    public interface AboutUiCallbacks {

    }


    @Override
    protected AboutUiCallbacks createUiCallbacks(AboutUi ui) {
        return new AboutUiCallbacks() {

        };
    }

    @Override
    protected void onUiAttached(AboutUi ui) {
        super.onUiAttached(ui);
    }

    @Override
    protected void populateUi(AboutUi ui) {

    }

    @Override
    protected String getUiTitle(AboutUi ui) {

        return null;
    }
}
