import { Component, OnInit } from '@angular/core';
import {ProductServiceService} from "../../service/product-service.service";
import {Product} from "../../model/product";
import {Page} from "../../model/page";

@Component({
  selector: 'app-product-gallery-page',
  templateUrl: './product-gallery-page.component.html',
  styleUrls: ['./product-gallery-page.component.scss']
})
export class ProductGalleryPageComponent implements OnInit {

  products: Product[] = [];

  page?:Page;

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
    this.productServiceService.findAll(page).subscribe( res =>{
      console.log("Loading products");
      this.page = res;
      this.products = res.content;
    }, err =>{
      console.log('Error loading products ${err}');
    });
  }
}
