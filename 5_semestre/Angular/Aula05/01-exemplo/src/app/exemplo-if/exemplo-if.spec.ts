import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExemploIf } from './exemplo-if';

describe('ExemploIf', () => {
  let component: ExemploIf;
  let fixture: ComponentFixture<ExemploIf>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ExemploIf]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExemploIf);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
