import { TestBed } from '@angular/core/testing';

import { ConvertstrService } from './convertstr.service';

describe('ConvertstrService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ConvertstrService = TestBed.get(ConvertstrService);
    expect(service).toBeTruthy();
  });
});
