import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormactionComponent } from './formaction.component';

describe('FormactionComponent', () => {
  let component: FormactionComponent;
  let fixture: ComponentFixture<FormactionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormactionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormactionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
