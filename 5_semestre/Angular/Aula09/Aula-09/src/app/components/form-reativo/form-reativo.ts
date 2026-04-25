import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-form-reativo',
  imports: [ReactiveFormsModule],
  templateUrl: './form-reativo.html',
  styleUrl: './form-reativo.css',
})
export class FormReativo {
  form:FormGroup;

  constructor ( private formbuilder:FormBuilder )  {
    this.form = this.formbuilder.group({
      nome:['', [Validators.required]], //Diz que o nome é obrigatorio
      email:['', [Validators.required, Validators.email]], //Verifica se possui o formato de e-mail
      idade:['', [Validators.required, Validators.min(1)]]
    });
  }
}
