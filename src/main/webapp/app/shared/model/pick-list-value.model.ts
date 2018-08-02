import { Moment } from 'moment';
import { IPickListValue } from 'app/shared/model//pick-list-value.model';
import { IBatch } from 'app/shared/model//batch.model';

export interface IPickListValue {
    id?: number;
    pickListValue?: string;
    status?: number;
    createdBy?: number;
    modifiedBy?: number;
    createdAt?: Moment;
    updatedAt?: Moment;
    selfIds?: IPickListValue[];
    varietys?: IBatch[];
    categorys?: IBatch[];
    pickListPickListName?: string;
    pickListId?: number;
    pickValuePickListValue?: string;
    pickValueId?: number;
}

export class PickListValue implements IPickListValue {
    constructor(
        public id?: number,
        public pickListValue?: string,
        public status?: number,
        public createdBy?: number,
        public modifiedBy?: number,
        public createdAt?: Moment,
        public updatedAt?: Moment,
        public selfIds?: IPickListValue[],
        public varietys?: IBatch[],
        public categorys?: IBatch[],
        public pickListPickListName?: string,
        public pickListId?: number,
        public pickValuePickListValue?: string,
        public pickValueId?: number
    ) {}
}
