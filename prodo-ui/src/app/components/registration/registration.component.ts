import { Component } from '@angular/core';
import {UserInfo} from "../../../model/UserInfo";

@Component({
    selector: 'registration',
    templateUrl: 'registration.component.html',
    styleUrls: ['registration.component.css']
})

export class RegistrationComponent {
    private userInfo: UserInfo = new UserInfo();

    constructor() {
    }
}
