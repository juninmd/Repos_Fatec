import { IonicPage, NavController, NavParams } from 'ionic-angular';

import { Component } from '@angular/core';
import { ProductsProvider } from '../../providers/products/products';

/**
 * Generated class for the ContactPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-contact',
  templateUrl: 'contact.html',
})
export class ContactPage {

  form: any = {};
  constructor(public navCtrl: NavController, public navParams: NavParams, private productsProvider: ProductsProvider) {
  }

  ionViewDidLoad() {

  }

  submitForm() {
    this.productsProvider.put(this.form).subscribe((q) => {
      this.navCtrl.push('ThankyouPage', { nome: this.form.nome });
    }, (err) => {

    })
  }

}
