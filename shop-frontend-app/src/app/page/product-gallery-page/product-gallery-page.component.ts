import { Component, OnInit } from '@angular/core';
import {ProductServiceService} from "../../service/product-service.service";
import {Product} from "../../model/product";
import {Page} from "../../model/page";
import {OrderStatusService} from "../../service/order-status.service";

@Component({
  selector: 'app-product-gallery-page',
  templateUrl: './product-gallery-page.component.html',
  styleUrls: ['./product-gallery-page.component.scss']
})
export class ProductGalleryPageComponent implements OnInit {

  products: Product[] = [];

  page?:Page;
  nameFilter?:string;

  constructor(private productServiceService: ProductServiceService) { }

  ngOnInit(): void {
    this.productServiceService.findAll().subscribe( res =>{
      console.log("Loading products");
      this.page = res;
      this.products = res.content;
    }, err =>{
      console.log('Error loading products ${err}');
    });
  }

  goToPage(page: number) {
    this.productServiceService.findAll(this.nameFilter ,page).subscribe( res =>{
      console.log("Loading products");
      this.page = res;
      this.products = res.content;
    }, err =>{
      console.log('Error loading products ${err}');
    });
  }

  filterApplied($event: string) {
    this.productServiceService.findAll($event, 1).subscribe(res=>{
      this.nameFilter=$event;
      this.page=res;
      this.products=res.content;
    },
      err => {
        console.log('Error loading products ${err}');
      } );
  }
}
