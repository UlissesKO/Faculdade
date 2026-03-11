import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DataBinding } from "./data-binding/data-binding";
import { ExemploFor } from './exemplo-for/exemplo-for';
import { ExemploIf } from './exemplo-if/exemplo-if';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, DataBinding, ExemploFor, ExemploIf],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('01-exemplo');
}
