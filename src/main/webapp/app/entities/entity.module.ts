import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { PghAppZonalModule } from './zonal/zonal.module';
import { PghAppSectorModule } from './sector/sector.module';
import { PghAppNurseryModule } from './nursery/nursery.module';
import { PghAppPickListModule } from './pick-list/pick-list.module';
import { PghAppPickListValueModule } from './pick-list-value/pick-list-value.module';
import { PghAppBatchModule } from './batch/batch.module';
import { PghAppDamageModule } from './damage/damage.module';
import { PghAppShadeAreaModule } from './shade-area/shade-area.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    // prettier-ignore
    imports: [
        PghAppZonalModule,
        PghAppSectorModule,
        PghAppNurseryModule,
        PghAppPickListModule,
        PghAppPickListValueModule,
        PghAppBatchModule,
        PghAppDamageModule,
        PghAppShadeAreaModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class PghAppEntityModule {}
