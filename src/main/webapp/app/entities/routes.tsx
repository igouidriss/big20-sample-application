import React from 'react';
import { Route } from 'react-router-dom';

import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import Table20 from './table-20';
import Table19 from './table-19';
import Table18 from './table-18';
import Table17 from './table-17';
import Table16 from './table-16';
import Table15 from './table-15';
import Table14 from './table-14';
import Table13 from './table-13';
import Table12 from './table-12';
import Table11 from './table-11';
import Table10 from './table-10';
import Table9 from './table-9';
import Table8 from './table-8';
import Table7 from './table-7';
import Table6 from './table-6';
import Table5 from './table-5';
import Table4 from './table-4';
import Table3 from './table-3';
import Table2 from './table-2';
import Table1 from './table-1';
/* jhipster-needle-add-route-import - JHipster will add routes here */

export default () => {
  return (
    <div>
      <ErrorBoundaryRoutes>
        {/* prettier-ignore */}
        <Route path="table-20/*" element={<Table20 />} />
        <Route path="table-19/*" element={<Table19 />} />
        <Route path="table-18/*" element={<Table18 />} />
        <Route path="table-17/*" element={<Table17 />} />
        <Route path="table-16/*" element={<Table16 />} />
        <Route path="table-15/*" element={<Table15 />} />
        <Route path="table-14/*" element={<Table14 />} />
        <Route path="table-13/*" element={<Table13 />} />
        <Route path="table-12/*" element={<Table12 />} />
        <Route path="table-11/*" element={<Table11 />} />
        <Route path="table-10/*" element={<Table10 />} />
        <Route path="table-9/*" element={<Table9 />} />
        <Route path="table-8/*" element={<Table8 />} />
        <Route path="table-7/*" element={<Table7 />} />
        <Route path="table-6/*" element={<Table6 />} />
        <Route path="table-5/*" element={<Table5 />} />
        <Route path="table-4/*" element={<Table4 />} />
        <Route path="table-3/*" element={<Table3 />} />
        <Route path="table-2/*" element={<Table2 />} />
        <Route path="table-1/*" element={<Table1 />} />
        {/* jhipster-needle-add-route-path - JHipster will add routes here */}
      </ErrorBoundaryRoutes>
    </div>
  );
};
