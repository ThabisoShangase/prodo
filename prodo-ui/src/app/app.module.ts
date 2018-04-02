import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {CommonModule} from "@angular/common";
import {NgbModule} from "@ng-bootstrap/ng-bootstrap";
import {RouterModule} from "@angular/router";
import {routes} from "./app.routes";
import {HomeComponent} from "./components/home/Home.component";
import {RegistrationComponent} from "./components/registration/registration.component";
import {FormsModule} from "@angular/forms";
import {SidebarComponent} from "./components/sidebar/sidebar.component";
import {MatButtonModule, MatCheckboxModule, MatInputModule} from "@angular/material";
import {NoopAnimationsModule} from "@angular/platform-browser/animations";


@NgModule({
    declarations: [
        AppComponent,
        HomeComponent,
        RegistrationComponent,
        SidebarComponent
    ],
    imports: [
        FormsModule,
        NoopAnimationsModule,
        BrowserModule,
        CommonModule,
        NgbModule.forRoot(),
        RouterModule.forRoot(routes),
        MatButtonModule,
        MatCheckboxModule,
        MatInputModule,
    ],
    providers: [NgbModule],
    bootstrap: [AppComponent]
})
export class AppModule {
}
