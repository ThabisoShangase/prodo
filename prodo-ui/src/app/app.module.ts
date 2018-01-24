import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import {CommonModule} from "@angular/common";
import {NgbModule} from "@ng-bootstrap/ng-bootstrap";
import {RouterModule} from "@angular/router";
import {routes} from "./app.routes";
import {HomeComponent} from "./components/home/Home.component";
import {RegistrationComponent} from "./components/registration/registration.component";
import {FormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    RegistrationComponent,
  ],
  imports: [
    FormsModule,
    BrowserModule,
    CommonModule,
    NgbModule.forRoot(),
    RouterModule.forRoot(routes)
  ],
  providers: [NgbModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
