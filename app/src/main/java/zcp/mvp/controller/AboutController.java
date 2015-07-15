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

package zcp.mvp.controller;


public class AboutController extends BaseUiController<AboutController.AboutUi,
        AboutController.AboutUiCallbacks> {


    public static AboutController mAboutController;

    public interface AboutUi extends BaseUiController.Ui<AboutUiCallbacks> {}


    public interface AboutUiCallbacks {

    }

    public static AboutController newInstance() {
        if (mAboutController == null) {
            mAboutController = new AboutController();
        }
        return  mAboutController;
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