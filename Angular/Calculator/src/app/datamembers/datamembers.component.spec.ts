import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DatamembersComponent } from './datamembers.component';

describe('DatamembersComponent', () => {
  let component: DatamembersComponent;
  let fixture: ComponentFixture<DatamembersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DatamembersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DatamembersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
