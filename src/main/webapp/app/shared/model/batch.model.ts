import { Moment } from 'moment';
import { IDamage } from 'app/shared/model//damage.model';
import { IShadeArea } from 'app/shared/model//shade-area.model';

export interface IBatch {
    id?: number;
    batchNo?: string;
    batchName?: string;
    quantity?: number;
    motherBed?: string;
    showingType?: number;
    sowingDate?: Moment;
    closedDate?: Moment;
    status?: number;
    createdBy?: number;
    modifiedBy?: number;
    createdAt?: Moment;
    updatedAt?: Moment;
    damages?: IDamage[];
    shadeAreas?: IShadeArea[];
    nurseryNurseryName?: string;
    nurseryId?: number;
    pickListVarietyPickListValue?: string;
    pickListVarietyId?: number;
    pickListCategoryPickListValue?: string;
    pickListCategoryId?: number;
}

export class Batch implements IBatch {
    constructor(
        public id?: number,
        public batchNo?: string,
        public batchName?: string,
        public quantity?: number,
        public motherBed?: string,
        public showingType?: number,
        public sowingDate?: Moment,
        public closedDate?: Moment,
        public status?: number,
        public createdBy?: number,
        public modifiedBy?: number,
        public createdAt?: Moment,
        public updatedAt?: Moment,
        public damages?: IDamage[],
        public shadeAreas?: IShadeArea[],
        public nurseryNurseryName?: string,
        public nurseryId?: number,
        public pickListVarietyPickListValue?: string,
        public pickListVarietyId?: number,
        public pickListCategoryPickListValue?: string,
        public pickListCategoryId?: number
    ) {}
}
