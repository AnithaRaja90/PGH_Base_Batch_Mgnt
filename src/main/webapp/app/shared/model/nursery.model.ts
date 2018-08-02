import { Moment } from 'moment';
import { IBatch } from 'app/shared/model//batch.model';

export interface INursery {
    id?: number;
    nurseryName?: string;
    nurseryAddress?: string;
    nurseryIncharge?: string;
    status?: number;
    createdBy?: number;
    modifiedBy?: number;
    createdAt?: Moment;
    updatedAt?: Moment;
    batchs?: IBatch[];
    sectorSectorName?: string;
    sectorId?: number;
}

export class Nursery implements INursery {
    constructor(
        public id?: number,
        public nurseryName?: string,
        public nurseryAddress?: string,
        public nurseryIncharge?: string,
        public status?: number,
        public createdBy?: number,
        public modifiedBy?: number,
        public createdAt?: Moment,
        public updatedAt?: Moment,
        public batchs?: IBatch[],
        public sectorSectorName?: string,
        public sectorId?: number
    ) {}
}
