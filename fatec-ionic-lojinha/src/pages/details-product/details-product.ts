import { IonicPage, NavController, NavParams } from 'ionic-angular';

import { Component } from '@angular/core';

/**
 * Generated class for the DetailsProductPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-details-product',
  templateUrl: 'details-product.html',
})
export class DetailsProductPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  product: any;

  ionViewDidLoad() {
    if (this.navParams.get('product'))
      this.product = this.navParams.get('product');
  }

  back() {
    this.navCtrl.goToRoot({});
  }

}
