import { Moment } from 'moment';

export interface IDamage {
    id?: number;
    noOfQuantity?: number;
    description?: string;
    date?: Moment;
    status?: number;
    createdBy?: number;
    modifiedBy?: number;
    createdAt?: Moment;
    updatedAt?: Moment;
    batchBatchName?: string;
    batchId?: number;
}

export class Damage implements IDamage {
    constructor(
        public id?: number,
        public noOfQuantity?: number,
        public description?: string,
        public date?: Moment,
        public status?: number,
        public createdBy?: number,
        public modifiedBy?: number,
        public createdAt?: Moment,
        public updatedAt?: Moment,
        public batchBatchName?: string,
        public batchId?: number
    ) {}
}
