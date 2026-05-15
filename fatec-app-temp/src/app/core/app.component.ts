import { Component } from '@angular/core';
import { MenuController } from '@ionic/angular';
import { NavController } from '@ionic/angular';
import { SessionService } from '../services/session.service';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.scss']
})
export class AppComponent {

  constructor(private menu: MenuController, public sessionService: SessionService, private nav: NavController) {

  }

  sair() {
    this.sessionService.logOff();
    this.nav.navigateRoot('login');
    this.menu.close();
  }

  closeMenu() {
    console.log('a')
    this.menu.close();
  }

  github() {
    window.open('https://github.com/juninmd/fatec-franca-app', '_blank')
    this.menu.close();
  }

}
