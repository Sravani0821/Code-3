import { Component, OnInit } from '@angular/core';
import { InventoryService } from './inventory.service';
import { Item } from './item';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent implements OnInit {

  items: Item[] = [];

  constructor(private inventoryService: InventoryService) { }

  ngOnInit(): void {
    this.inventoryService.getItems().subscribe(data => {
      this.items = data;
    });
  }
}
